package manejojavabeans;

import beans.PersonaBean;

public class ManejoJavaBeans {
    public static void main(String[] args) {
        PersonaBean bean = new PersonaBean();
        bean.setNombre("Pepa");
        bean.setEdad(28);
        
        System.out.println("Nombre: " + bean.getNombre());
        System.out.println("Edad: " + bean.getEdad());
        
        PersonaBean bean2 = new PersonaBean("Bananina", 27);
        System.out.println(bean2);
        
    }
}
