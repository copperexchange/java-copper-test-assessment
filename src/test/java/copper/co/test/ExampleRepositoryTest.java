package copper.co.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class ExampleRepositoryTest {
    @Autowired
    private ExampleEntityRepository testRepository;

    @Test
    void findAllTest() {
        testRepository.save(new ExampleEntity(1L, "val"));
        ExampleEntity entity = testRepository.getById(1L);
        assertThat(entity).isEqualTo(new ExampleEntity(1L, "val"));
    }
}
