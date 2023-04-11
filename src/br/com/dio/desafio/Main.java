package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("#########DEV - "+ devCamila.getNome()+ "##########");
        System.out.println("Conteudos Inscritos:" + devCamila.getConteudosInscrito());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos:" + devCamila.getConteudosInscrito());
        System.out.println("Conteudos Concluidos:" + devCamila.getConteudosConcluidos());
        System.out.println(" "+devCamila.getNome()+" progrediu em " +devCamila.getCont()+" cursos");
        System.out.println("XP:" + devCamila.calcularTotalXP());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("#########DEV - "+ devJoao.getNome()+ "##########");
        System.out.println("Conteudos Inscritos:" + devJoao.getConteudosInscrito());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos:" + devJoao.getConteudosInscrito());
        System.out.println("Conteudos Concluidos:" + devJoao.getConteudosConcluidos());
        System.out.println(" "+devJoao.getNome()+" progrediu em " +devJoao.getCont()+" cursos");
        System.out.println("XP:" + devJoao.calcularTotalXP());
	}

}
