package com.vote.entity;
import lombok.*;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;

import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@Table(name="People")
public class People {
	@Id
	@SequenceGenerator(name="People_seq",sequenceName="People_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="People_seq")
	@Column(name="People_ID",unique = true, nullable = true)
	private @NotNull Long id;
	private @NotNull String name;

}