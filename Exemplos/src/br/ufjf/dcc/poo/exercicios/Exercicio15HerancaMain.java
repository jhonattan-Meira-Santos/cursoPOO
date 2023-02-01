package br.ufjf.dcc.poo.exercicios;
import br.ufjf.dcc.poo.exercicios.Exercicio15HerancaAutomovel;
import br.ufjf.dcc.poo.exercicios.Exercicio15HerancaCaminhao;
public class Exercicio15HerancaMain {
	Exercicio15HerancaAutomovel automovel = new Exercicio15HerancaAutomovel();
	automovel.setMarca("Mercedes");
	automovel.setKmPorLitro(15f)
	automovel.setCapacidadeTanque(55);
	System.out.println("Valor do consumo" + automovel.calcularConsumo(5.11f));
}
