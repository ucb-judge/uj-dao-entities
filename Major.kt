package ucb.judge.ujsubmissions.dao

import javax.persistence.*

@Entity
@Table(name = "major")
class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "major_id")
    var majorId: Long = 0;

    @Column(name = "name")
    var name: String = "";

    @Column(name = "status")
    var status: Boolean = true;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "major")
    var campusMajors: List<CampusMajor>? = null;
}