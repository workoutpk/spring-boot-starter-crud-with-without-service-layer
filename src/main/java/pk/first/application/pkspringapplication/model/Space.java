package pk.first.application.pkspringapplication.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
@Table(name = "space")
@Accessors(chain = true)
public class Space {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(length = 20, unique = true, nullable = false)
    private String universeName;
    @Column(nullable = false)
    private String galaxyName;
//    @OneToOne(targetEntity = Time.class,cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "time_id",nullable = false, referencedColumnName = "id")
//    @JsonBackReference(value = "time-space")
//    private Time time;
    @Lob
    @Column
    private String note;
}
