import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
            curso1.setTitulo("Curso Java");
            curso1.setDescricao("Descrição curso java");
            curso1.setCargaHoraria(8);
            System.out.println("=============================");

        Curso curso2 = new Curso();
            curso2.setTitulo("Curso Kotlin");
            curso2.setDescricao("Descrição curso Kotlin");
            curso2.setCargaHoraria(16);
            System.out.println("=============================");


        Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria java");
            mentoria.setDescricao("Descrição mentoria java");
            mentoria.setData(LocalDate.now());
            System.out.println("===============================");


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev gDev = new Dev();
        gDev.setNome("Gabriel");
        gDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Gabriel: "+ gDev.getConteudosInscritos());
        System.out.println("==========");
        gDev.progredir();
        System.out.println("Conteúdos inscritos de Gabriel: "+ gDev.getConteudosInscritos());
        System.out.println("==========");
        System.out.println("Conteúdos Concluidos de Gabriel: "+ gDev.getConteudosConcluidos());
        System.out.println("|Gabriel| Xp: \n"+gDev.calcularTotalXp());


        Dev aDev = new Dev();
        aDev.setNome("Adrian");
        aDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Adrian: "+ aDev.getConteudosInscritos());
        System.out.println("==========");
        aDev.progredir();
        aDev.progredir();
        aDev.progredir();
        System.out.println("Conteúdos inscritos de Adrian: "+ aDev.getConteudosInscritos());
        System.out.println("==========");
        System.out.println("Conteúdos Concluidos de Adrian: "+ aDev.getConteudosConcluidos());
        System.out.println("|Adrian| XP: " + aDev.calcularTotalXp());



         



        }
    }
