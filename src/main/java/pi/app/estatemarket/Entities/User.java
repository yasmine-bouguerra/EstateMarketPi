package pi.app.estatemarket.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name="Consumer")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class User implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idUser;
        private String lastname;
        private String firstname;
        private String email;
        private String phone;
        private String address;
        private int age;
        private String userPassword;
        @Enumerated(EnumType.STRING)
        private GenderType genderType;

        @ManyToOne
        private Role part;

        @OneToMany (mappedBy = "userPub")
        private Set<Publication> publications;

        @OneToMany(mappedBy = "userMessage")
        private Set<Message> messagess;

        @OneToMany(mappedBy = "userComment")
        private Set<Comment> comments;

        @OneToMany(mappedBy = "userAgency")
        private Set<Agency> agencies;

        @OneToMany(mappedBy = "userContract")
        private Set<Contract> contracts;

        @OneToMany(mappedBy = "userAnnouncement")
        private Set<Announcement> announcements;

        @ManyToMany
        private Set<User> appointments;

}

