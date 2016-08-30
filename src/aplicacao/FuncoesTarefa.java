package aplicacao;

import java.util.ArrayList;

import entidade.Data;
import entidade.Tarefa;

public class FuncoesTarefa {
	public static void AddTarefa(ArrayList<Tarefa> tarefas) {
		Tarefa tarefa = new Tarefa();
		Data data = new Data();

		System.out.println("Informe o titulo da tarefa: ");
		tarefa.setTitulo(Ler.linha());

		Ler.nextLine();

		System.out.println("Informe a descricao da tarefa: ");
		tarefa.setDescricao(Ler.linha());

		System.out.println("Informe o dia da tarefa: ");
		data.setDia(Ler.inteiro());
		System.out.println("Informe o mes da tarefa: ");
		data.setMes(Ler.inteiro());
		System.out.println("Informe o ano da tarefa: ");
		data.setAno(Ler.inteiro());

		tarefa.setData(data);

		if (tarefas.add(tarefa)) {
			System.out.println("Tarefa adicionada com sucesso.\n" + "Índice: " + (tarefas.size() - 1));
		} else {
			System.out.println("Erro ao adicionar tarefa.");
		}
	}

	public static void RemoverTarefa(ArrayList<Tarefa> tarefas) {
		int removerIndex;
		Tarefa aux = null;

		System.out.println("Informe o índice da tarefa a remover: ");
		removerIndex = Ler.inteiro();

		try {

			if (tarefas.size() == 0)
				throw new IndexOutOfBoundsException("A lista está vazia.");

			if (removerIndex > tarefas.size() - 1)
				throw new IndexOutOfBoundsException("O índice informado é maior que o tamanho da lista.");

			aux = tarefas.remove(removerIndex);

			System.out.println("Tarefa '" + aux.getTitulo() + "' removida.");

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void MarcarComoConcluida(ArrayList<Tarefa> tarefas) {
		int alterarStatusIndex;
		Tarefa auxStatus = null;

		System.out.println("Informe o índice da tarefa a alterar status: ");
		alterarStatusIndex = Ler.inteiro();

		try {

			if (tarefas.size() == 0)
				throw new IndexOutOfBoundsException("A lista está vazia.");

			if (alterarStatusIndex > tarefas.size() - 1)
				throw new IndexOutOfBoundsException("O índice informado é maior que o tamanho da lista.");

			auxStatus = tarefas.get(alterarStatusIndex);

			auxStatus.setStatus(true);

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void PesquisarPorTitulo(ArrayList<Tarefa> tarefas) {
		String titulo;

		System.out.println("Informe o titulo a pesquisar: ");
		titulo = Ler.linha();

		for (int i = 0; i < tarefas.size(); i++) {
			Tarefa t = tarefas.get(i);

			if (t.getTitulo().equals(titulo)) {
				System.out.println("Titulo: " + t.getTitulo());
				System.out.println("Descrição: " + t.getDescricao());
				System.out.println(
						"Data: " + t.getData().getDia() + "/" + t.getData().getMes() + "/" + t.getData().getAno());
				System.out.println("Status: " + t.isStatus());

				break;
			}
		}

	}

	public static void MostraPendentes(ArrayList<Tarefa> tarefas) {
		for (int i = 0; i < tarefas.size(); i++) {

			Tarefa t = tarefas.get(i);

			if (t.isStatus().equals("Pendente")) {
				System.out.println("\nTitulo: " + t.getTitulo());
				System.out.println("Descrição: " + t.getDescricao());
				System.out.println(
						"Data: " + t.getData().getDia() + "/" + t.getData().getMes() + "/" + t.getData().getAno());
				System.out.println("Status: " + t.isStatus());
			}

		}
	}

	public static void MostraConcluidas(ArrayList<Tarefa> tarefas) {
		for (int i = 0; i < tarefas.size(); i++) {

			Tarefa t = tarefas.get(i);

			if (t.isStatus().equals("Concluída")) {
				System.out.println("\nTitulo: " + t.getTitulo());
				System.out.println("Descrição: " + t.getDescricao());
				System.out.println(
						"Data: " + t.getData().getDia() + "/" + t.getData().getMes() + "/" + t.getData().getAno());
				System.out.println("Status: " + t.isStatus());
			}

		}

	}
}
