import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {
    private Pessoa pessoa1;
    private Pessoa pessoa2;
    private Pessoa pessoa3;

    @BeforeEach
    public void setUp(){
        pessoa1 = new Pessoa(LocalDate.of(2001,8,3));
        pessoa2 = new Pessoa(LocalDate.of(1998,1,30));
        pessoa3 = new Pessoa(LocalDate.of(2005,5,23));
    }


    @Test
    public void getSigno(){
        Assertions.assertEquals("Leão", pessoa1.getSigno());
        Assertions.assertEquals("Aquário", pessoa2.getSigno());
        Assertions.assertEquals("Gêmeos", pessoa3.getSigno());
    }

}