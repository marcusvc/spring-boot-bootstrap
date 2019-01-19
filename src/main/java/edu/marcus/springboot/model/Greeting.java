package edu.marcus.springboot.model;

import javax.validation.constraints.NotBlank;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class Greeting {
	
	private long id;
	@NotBlank
    private String content;
    
    public Greeting() {}

    public Greeting(long id, String content) {
		this.content = content;
		this.id = id;
	}
	public long getId() {
        return id;
    }
    public String getContent() {
        return content;
    }
	public void setId(long id) {
		this.id = id;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
