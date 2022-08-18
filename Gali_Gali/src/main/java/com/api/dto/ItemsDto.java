package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class ItemsDto {
	private @Getter @Setter Integer id ;
	private @Getter @Setter String name ;
	private @Getter @Setter int price;
	private @Getter @Setter String description;
	private @Getter @Setter Boolean available;
}
