package kr.ac.sejong.domain_jpa;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tbl_track_subject")
@EqualsAndHashCode(of = "id")
@ToString
public class TrackSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trackSubjectId")
    private Long id;

    private Long subjectType;

    @ManyToOne
    @JoinColumn(name = "trackId")
    Track track;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    Subject subject;
}
