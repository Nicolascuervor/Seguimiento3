package Ejercicio7;

import javax.swing.*;


public class Gestion {

    public String prestado;

    public void buscarLibro(Libro libro1, Libro libro2,  Libro libro3, Libro libro4, Libro libro5){

        var decision1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el ISBN del libro: "));

        if ((libro1.getISBN() == decision1) || (libro2.getISBN() == decision1) || (libro3.getISBN() == decision1) || (libro4.getISBN() == decision1) || (libro5.getISBN() == decision1)){
            System.out.println("Libro disponible");}
            else System.out.println("No encontrado");
    }



    public void prestamoLibro(Libro libro1, Libro libro2,  Libro libro3, Libro libro4, Libro libro5, Usuario usuario){

        int decision = Integer.parseInt(JOptionPane.showInputDialog(null,"Elija los libros disponibles para prestar: \n1. " + libro1.getTitulo() + "\n2. " + libro2.getTitulo() + "\n3. " + libro3.getTitulo() + "\n4. " + libro4.getTitulo() + "\n5. " + libro5.getTitulo()));
        switch (decision){
            case 1:
                JOptionPane.showMessageDialog(null,"El libro " + libro1.getTitulo() + " fue prestado al usuario: \n Nombre: " + usuario.getNombre() + "\n ID: " + usuario.getId() + "\n Cell: " + usuario.getTelefono() );
                prestado = libro1.getTitulo();
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"El libro " + libro2.getTitulo() + " fue prestado al usuario: \n Nombre: " + usuario.getNombre() + "\n ID: " + usuario.getId() + "\n Cell: " + usuario.getTelefono() );
                prestado = libro2.getTitulo();
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"El libro " + libro3.getTitulo() + " fue prestado al usuario: \n Nombre: " + usuario.getNombre() + "\n ID: " + usuario.getId() + "\n Cell: " + usuario.getTelefono() );
                prestado = libro3.getTitulo();
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"El libro " + libro4.getTitulo() + " fue prestado al usuario: \n Nombre: " + usuario.getNombre() + "\n ID: " + usuario.getId() + "\n Cell: " + usuario.getTelefono() );
                prestado = libro4.getTitulo();
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"El libro " + libro5.getTitulo() + " fue prestado al usuario: \n Nombre: " + usuario.getNombre() + "\n ID: " + usuario.getId() + "\n Cell: " + usuario.getTelefono() );
                prestado = libro5.getTitulo();
                break;
            default:JOptionPane.showMessageDialog(null,"Dato erroneo ingresado!!");

        }


    }
    public void devolucion(Usuario usuario,Libro libro1, Libro libro2,  Libro libro3, Libro libro4, Libro libro5){
        if ((prestado == libro1.getTitulo()) || (prestado == libro2.getTitulo()) || prestado == libro3.getTitulo() || prestado == libro4.getTitulo() || prestado == libro5.getTitulo()){
            int decision = JOptionPane.showConfirmDialog(null,"Desea regresar el libro: " + prestado + "? ");
            if(decision == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null,"Se ha devuelto el libro a la biblioteca");
                prestado = null;
            }
            else if (decision == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null,"Se ha cancelado el proceso de devolucion");

            }
            }
        else JOptionPane.showMessageDialog(null,"NO tiene libros prestados");
        }


       public void librosPrestado(Usuario usuario){
        if (prestado != null){
            System.out.println("El libro: " + prestado + " fue prestado al usuario: \n Nombre: " + usuario.getNombre() + "\n ID: " + usuario.getId() + "\n Cell: " + usuario.getTelefono());
        }
        else System.out.println("No se han prestado libros aun");
       }

    }


