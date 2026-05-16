package I;

public class ServicoRelatorio implements GeradorRelatorio {

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório gerado com sucesso!");
    }
}