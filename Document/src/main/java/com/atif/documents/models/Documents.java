package com.atif.documents.models;

import java.util.Arrays;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Getter
@Setter
@NoArgsConstructor
public class Documents {

	@Id
	private int id;
	private String name;
	private String type;
	private String size;
	private byte[] contents;

	@Override
	public String toString() {
		return "Documents [id=" + id + ", name=" + name + ", type=" + type + ", size=" + size + ", contents="
				+ Arrays.toString(contents) + "]";
	}

}
