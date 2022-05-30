package br.com.glandata.main;

import br.com.glandata.models.FolhaPagamento;

public class GeraFolhaPagamento {

	public static void main(String[] args) {
		FolhaPagamento folhaGian = new FolhaPagamento();
		folhaGian.setDiasTrabalhados(22);
		folhaGian.setFaltas(2);
		System.out.println(folhaGian);
		
		FolhaPagamento folhaAlessandra = new FolhaPagamento();
		folhaAlessandra.setDiasTrabalhados(22);
		folhaAlessandra.setFaltas(1);
		System.out.println(folhaAlessandra);
		
		System.out.println(folhaAlessandra.equals(folhaGian));
	}

}
