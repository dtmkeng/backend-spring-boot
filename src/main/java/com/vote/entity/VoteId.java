package com.vote.entity;
import lombok.*;

import javax.persistence.Id;

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
@Table(name="VoteId")
public class VoteId {
	@Id
	@SequenceGenerator(name="voteid_seq",sequenceName="voteid_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="voteid_seq")
	@Column(name="voteid_ID",unique = true, nullable = true)
	private @NonNull Long id;
	// private @NonNull String name;

}