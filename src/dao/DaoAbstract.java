/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author u07236073113
 */
public abstract class DaoAbstract {
     public abstract void insert(Object objeto);
     public abstract void update(Object objeto);
     public abstract void delete(Object objeto);
     public abstract Object list(int id);
     public abstract Object listAll();

}
