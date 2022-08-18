package com.api.dto;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.api.model.Items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AllItemsDTO {
	private @Getter @Setter int totalItems;
	private @Getter @Setter List<Items> itemsList;
}
