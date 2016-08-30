package aplicacao;

import java.util.ArrayList;

import entidade.Tarefa;

public class Programa {
	public static void main(String args[]) {
		ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
		int escolha, repetir = 0;

		do {
			System.out.println("1 - Adicionar tarefa;");
			System.out.println("2 - Remover tarefa;");
			System.out.println("3 - Marcar tarefa como concluida;");
			System.out.println("4 - Pesquisar tarefa por titulo;");
			System.out.println("5 - Mostrar tarefas pendentes;");
			System.out.println("6 - Mostrar tarefas concluidas;");
			System.out.println("Informe sua escolha: ");
			escolha = Ler.inteiro();

			switch (escolha) {
			case 1:
				FuncoesTarefa.AddTarefa(tarefas);
				break;
			case 2:
				FuncoesTarefa.RemoverTarefa(tarefas);
				break;
			case 3:
				FuncoesTarefa.MarcarComoConcluida(tarefas);
				break;
			case 4:
				FuncoesTarefa.PesquisarPorTitulo(tarefas);
				break;
			case 5:
				FuncoesTarefa.MostraPendentes(tarefas);
				break;
			case 6:
				FuncoesTarefa.MostraConcluidas(tarefas);
				break;
			}
			System.out.println("\nRepetir? Aperte 1 se SIM, qualquer outro se NÃO: ");
			repetir = Ler.inteiro();
		} while (repetir == 1);
		
		System.out.println("\nFim");
	}
}
