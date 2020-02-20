

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProdutoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProdutoTest
{
    /**
     * Default constructor for test class ProdutoTest
     */
    public ProdutoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void teste01_CriarProduto()
    {
        Produto produto1 = new Produto(10, "Impressora");
        assertEquals(10, produto1.getCodigo());
        assertEquals("Impressora", produto1.getNome());
        assertEquals(0.0, produto1.getPreco(), 0.001);
        assertFalse(produto1.estaDisponivel());
    }

    @Test
    public void teste02_CriarProdutoMaisDados()
    {
        Produto produto1 = new Produto(10, "Impressora");
        produto1.setPreco(123.45);
        produto1.tornarDisponivel();
        assertEquals(123.45, produto1.getPreco(), 0.001);
        assertTrue(produto1.estaDisponivel());
    }

    @Test
    public void teste03_DadosInvalidos()
    {
        Produto produto1 = new Produto(10, "Impressora");
        produto1.setPreco(-23.52); // Não poderia
        assertEquals(0.0, produto1.getPreco(), 0.001);
    }
}

