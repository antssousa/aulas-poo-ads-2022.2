package ifpi.poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO implements GenericDAO<Aluno> {

    public Connection getConnection() throws SQLException {
        try {
            // Class.forName("org.h2.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
            // String url = "h2:jdbc:./escola";
            // String url = "h2:jdbc:~/escola";
            String url = "jdbc:mariadb://localhost:3306/escola";
            // String user = "admin";
            String user = "admin";
            String pw = "123456";
            return DriverManager.getConnection(url, user, pw);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insert(Aluno e) {
        try (Connection con = getConnection()) {
            if (con != null) {
                String sql = "insert into aluno (nome, curso, media) "
                        + "values (?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, e.getNome());
                ps.setString(2, e.getCurso());
                ps.setDouble(3, e.getMedia());
                ps.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Aluno selectById(long id) {
        try (Connection con = getConnection()) {
            if (con != null) {
                String sql = "select * from aluno where id = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setLong(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    Aluno aluno = getAluno(rs);
                    return aluno;
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private Aluno getAluno(ResultSet rs) throws SQLException {
        Aluno aluno = new Aluno();
        aluno.setId(rs.getLong("id"));
        aluno.setNome(rs.getString("nome"));
        aluno.setCurso(rs.getString("curso"));
        aluno.setMedia(rs.getDouble("media"));
        return aluno;
    }

    @Override
    public List<Aluno> selectAll() {
        List<Aluno> turma = new ArrayList<Aluno>();
        try (Connection con = getConnection()) {
            if (con != null) {
                String sql = "select * from aluno";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Aluno aluno = getAluno(rs);
                    turma.add(aluno);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return turma;
    }

    @Override
    public List<Aluno> selectByName(String nome) {
        List<Aluno> turma = new ArrayList<Aluno>();
        try (Connection con = getConnection()) {
            if (con != null) {
                String sql = "select * from aluno where like ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, '%' + nome + '%');
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Aluno aluno = getAluno(rs);
                    turma.add(aluno);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return turma;

    }

    @Override
    public boolean update(Aluno e) {
        try (Connection con = getConnection()) {
            if (con != null) {
                String sql = "update aluno set nome = ?, curso = ?, media = ? where id = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, e.getNome());
                ps.setString(2, e.getCurso());
                ps.setDouble(3, e.getMedia());
                ps.setLong(4, e.getId());
                ps.executeUpdate();
                return true;

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Aluno e) {
        try (Connection con = getConnection()) {
            if (con != null) {
                String sql = "delete from aluno where id = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setLong(1, e.getId());
                ps.executeUpdate();
                return true;

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
