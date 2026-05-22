package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatalogoTest {

    @Test
    void deveContarLivrosDisponiveisAcervo() {
        Acervo acervo = new Acervo(
                new Livro("Dom Quixote", true),
                new Livro("1984", true),
                new Livro("O Senhor dos Anéis", false),
                new Livro("A Revolução dos Bichos", true)
        );
        assertEquals(3, Catalogo.contarLivrosDisponiveisAcervo(acervo));
    }

    @Test
    void deveContarTotalLivrosAcervo() {
        Acervo acervo = new Acervo(
                new Livro("Dom Quixote", true),
                new Livro("1984", true),
                new Livro("O Senhor dos Anéis", false),
                new Livro("A Revolução dos Bichos", true)
        );
        assertEquals(4, Catalogo.contarTotalLivrosAcervo(acervo));
    }
}
