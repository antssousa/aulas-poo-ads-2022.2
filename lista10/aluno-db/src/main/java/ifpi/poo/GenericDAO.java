package ifpi.poo;

import java.util.List;

public interface GenericDAO<E> {
    public boolean insert(E e);

    public E selectById(long id);

    public List<E> selectAll();

    public List<E> selectByName(String nome);

    public boolean update(E e);

    public boolean delete(E e);
}
