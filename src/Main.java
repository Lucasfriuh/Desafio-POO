import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java ");
        curso.setDescricao("Descrição do curso java ");
        curso.setCargaHorária(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Js ");
        curso1.setDescricao("Descrição do curso js ");
        curso1.setCargaHorária(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java ");
        mentoria.setDescricao("Descrição da mentoria java ");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("A descrição tava na porta frente");
        bootcamp.setDescricao("Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscrito para Lucas: " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos lucas: " + devLucas.getConteudosInscritos());
        System.out.println("Conteudos concluidos lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularXP());

        Dev devBia = new Dev();
        devBia.setNome("Bia");
        devBia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscrito para Bia: " + devBia.getConteudosInscritos());
        devBia.progredir();
        devBia.progredir();
        devBia.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos bia: " + devBia.getConteudosInscritos());
        System.out.println("Conteudos concluidos bia: " + devBia.getConteudosConcluidos());
        System.out.println("XP: " + devBia.calcularXP());

    }
}
