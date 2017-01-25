package by.epam.filmrating.service;

import by.epam.filmrating.entity.Entity;
import by.epam.filmrating.exception.ServiceException;

import java.util.List;

public abstract class AbstractService<T extends Entity> {
    public abstract List<T> findAll() throws ServiceException;
    public abstract T findEntityById(int id) throws ServiceException;
    public abstract boolean delete(int id) throws ServiceException;
    public abstract boolean create(T entity) throws ServiceException;
    public abstract List<T> findFilmEntity(int id) throws ServiceException;
}