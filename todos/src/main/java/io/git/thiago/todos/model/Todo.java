package io.git.thiago.todos.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
	private Long Id;
	
	@Column
	private String descripition;
	
	
	@Column
	private Boolean done;
	
	@Column
	private LocalDateTime createdDate;
	
	
	@Column
	private LocalDateTime doneDate;


	public void setDescripition(String descripition2) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
	
}
