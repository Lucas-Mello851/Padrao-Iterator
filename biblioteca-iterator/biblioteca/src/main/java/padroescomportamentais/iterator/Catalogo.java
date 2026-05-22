package padroescomportamentais.iterator;

import java.util.Iterator;

public class Catalogo {

    public static Integer contarLivrosDisponiveisAcervo(Acervo acervo) {
        int quantidade = 0;
        for (Livro livro : acervo) {
            if (livro.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivrosAcervo(Acervo acervo) {
        int quantidade = 0;
        for (Iterator a = acervo.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
