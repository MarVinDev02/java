package NivelIntermediario.encapsulamento.enums;

public enum RankDeMissoes {
    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortável", 4),
    A("Dificil", 5),
    S("Muito dificil", 6);

    private String descricao;
    private int dificuldade;

    RankDeMissoes() {
    }

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
