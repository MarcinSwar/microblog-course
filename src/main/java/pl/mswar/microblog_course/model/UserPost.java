package pl.mswar.microblog_course.model;

import java.util.Date;
import java.util.Objects;

public class UserPost {
    private String note;
    private Date creationDate;
    private PostStatus postStatus;
    private PostType postType;
    private User postAuthor;

    public UserPost(String note, Date creationDate, PostStatus postStatus, PostType postType, User postAuthor) {
        this.note = note;
        this.creationDate = creationDate;
        this.postStatus = postStatus;
        this.postType = postType;
        this.postAuthor = postAuthor;
    }

    public UserPost() {
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public PostStatus getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(PostStatus postStatus) {
        this.postStatus = postStatus;
    }

    public PostType getPostType() {
        return postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public User getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(User postAuthor) {
        this.postAuthor = postAuthor;
    }

    @Override
    public String toString() {
        return "UserPost{" +
                "note='" + note + '\'' +
                ", creationDate=" + creationDate +
                ", postStatus=" + postStatus +
                ", postType=" + postType +
                ", postAuthor=" + postAuthor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPost userPost = (UserPost) o;
        return Objects.equals(note, userPost.note) &&
                Objects.equals(creationDate, userPost.creationDate) &&
                postStatus == userPost.postStatus &&
                postType == userPost.postType &&
                Objects.equals(postAuthor, userPost.postAuthor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(note, creationDate, postStatus, postType, postAuthor);
    }
}
