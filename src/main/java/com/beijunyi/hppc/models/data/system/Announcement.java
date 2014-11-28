package com.beijunyi.hppc.models.data.system;

import java.util.Date;
import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "announcement")
@DynamicUpdate
public class Announcement {

  @Id
  @GeneratedValue
  private Integer id;

  @Column(nullable = false, updatable = false)
  private Date timestamp;

  @Column(nullable = false)
  private String type;

  @Column(nullable = false)
  private String title;

  @Column(nullable = true)
  private String keywords;

  @Column(nullable = false)
  private String content;

  public Announcement(Date timestamp, String type, String title, String keywords, String content) {
    this.timestamp = timestamp;
    this.type = type;
    this.title = title;
    this.keywords = keywords;
    this.content = content;
  }

  public Announcement() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
