package com.gabrielrosadn.livecodding;

import com.gabrielrosadn.livecodding.model.User;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    User newUser = new User("jopa", "santos");

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void check_get_name_method(){
        assertEquals(newUser.getName(), "jopa");
    }

    @Test
    public void retorna_nome_completo(){

        assertEquals(newUser.getFullName(), "jopa santos");
    }
}