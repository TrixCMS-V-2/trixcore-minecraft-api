package eu.trixcms.trixcore.api;

import eu.trixcms.trixcore.api.util.GsonParser;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class GsonParserTest {

    private static class TestObject {
        private String title;

        public TestObject(String title){
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }

    @Test
    public void serialize(){
        TestObject obj = new TestObject("Hello World");
        String json = new GsonParser<TestObject>().serialize(obj);

        assertThat(json).isEqualTo("{\"title\":\"Hello World\"}");
    }

    @Test
    public void deserialize(){
        String json = "{\"title\":\"Hello World\"}";
        TestObject obj = new GsonParser<TestObject>().deserialize(TestObject.class, json);

        assertThat(obj.getTitle()).isEqualTo("Hello World");
    }

}
