package com.junior.crud.service;

import com.junior.crud.dao.UserDao;
import com.junior.crud.entity.User;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Transactional
@Path("/users")
public class UserService {

    @Inject
    private UserDao userDao;
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addUser(User user) throws PersistenceException {
        try {
            userDao.addUser(user);
        } catch (PersistenceException e) {
            // Tratar a exceção de persistência de maneira apropriada
            System.out.println("Erro ao adicionar usuário: " + e.getMessage());
            throw new PersistenceException("Erro ao adicionar usuário", e);
        }
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById(Long id) throws PersistenceException {
        try {
            return userDao.getUserById(id);
        } catch (PersistenceException e) {
            // Tratar a exceção de persistência de maneira apropriada
            System.out.println("Erro ao buscar usuário por ID: " + e.getMessage());
            throw new PersistenceException("Erro ao buscar usuário por ID", e);
        }
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUsers() throws PersistenceException {
        try {
            return userDao.getAllUsers();
        } catch (PersistenceException e) {
            // Tratar a exceção de persistência de maneira apropriada
            System.out.println("Erro ao buscar todos os usuários: " + e.getMessage());
            throw new PersistenceException("Erro ao buscar todos os usuários", e);
        }
    }
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateUser(User user) throws PersistenceException {
        try {
            userDao.updateUser(user);
        } catch (PersistenceException e) {
            // Tratar a exceção de persistência de maneira apropriada
            System.out.println("Erro ao atualizar usuário: " + e.getMessage());
            throw new PersistenceException("Erro ao atualizar usuário", e);
        }
    }
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteUser(User user) throws PersistenceException {
        try {
            userDao.deleteUser(user);
        } catch (PersistenceException e) {
            // Tratar a exceção de persistência de maneira apropriada
            System.out.println("Erro ao deletar usuário: " + e.getMessage());
            throw new PersistenceException("Erro ao deletar usuário", e);
        }
    }
}
