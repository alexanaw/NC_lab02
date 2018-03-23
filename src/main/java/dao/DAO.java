package dao;

import org.jetbrains.annotations.NotNull;

public interface DAO<T> {
    void create(@NotNull T entity);

    T read(@NotNull Long id);

    void update(@NotNull T entity);

    void delete(@NotNull Long id);
}
