package kr.ac.sejong.web.dto;

import kr.ac.sejong.domain.notice.Notice;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class NoticeResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private Date date;

    public NoticeResponseDto(Notice notice) {
        this.id = notice.getId();
        this.author = notice.getAuthor();
        this.content = notice.getContent();
        this.title = notice.getTitle();
        this.date = notice.getCreatedDate();
    }

}