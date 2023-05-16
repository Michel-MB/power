package net.javaguides.springboot.model;



import javax.persistence.*;

@Entity
@Table(name="documents")

public class Documents {
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Long id;
    private String user;
    private String profile;
    private long size;
    private String plotNumber;
    @Lob
    @Column(name = "content", columnDefinition = "LONGBLOB")
    private byte[] content;

    public Documents() {
    }

    public Documents(String user, String profile, long size, String plotNumber, byte[] content) {
        this.user = user;
        this.profile = profile;
        this.size = size;
        this.plotNumber = plotNumber;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getPlotNumber() {
        return plotNumber;
    }

    public void setPlotNumber(String plotNumber) {
        this.plotNumber = plotNumber;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
