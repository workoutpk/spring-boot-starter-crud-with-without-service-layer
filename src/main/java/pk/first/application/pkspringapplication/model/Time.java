package pk.first.application.pkspringapplication.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name ="time")
@Accessors(chain = true)
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String timeDilation;
    @Column(nullable = false)
    private Date originDate;
    @Column(nullable = false)
    private Date windupDate;

//    @OneToOne(mappedBy = "time")
//    private Space space;
}
