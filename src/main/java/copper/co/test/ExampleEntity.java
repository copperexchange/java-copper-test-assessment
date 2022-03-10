package copper.co.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "example_entity")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExampleEntity {
    @Id
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "val", updatable = false)
    private String val;
}
