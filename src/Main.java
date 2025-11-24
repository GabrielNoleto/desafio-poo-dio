import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.lang.management.MemoryNotificationInfo;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
            curso1.setTitulo("Curso Java");
            curso1.setDescricao("Descrição curso java");
            curso1.setCargaHoraria(8);
            System.out.println(curso1);
            System.out.println("=============================");

        Curso curso2 = new Curso();
            curso2.setTitulo("Curso Kotlin");
            curso2.setDescricao("Descrição curso Kotlin");
            curso2.setCargaHoraria(16);
            System.out.println(curso2);
            System.out.println("=============================");


        Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria java");
            mentoria.setDescricao("Descrição mentoria java");
            mentoria.setData(LocalDate.now());

            System.out.println(mentoria);
            System.out.println("===============================");



        }
    }
