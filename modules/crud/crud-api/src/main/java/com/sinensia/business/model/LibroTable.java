/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sinensia.business.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;LIBRO_Libro&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Libro
 * @generated
 */
public class LibroTable extends BaseTable<LibroTable> {

	public static final LibroTable INSTANCE = new LibroTable();

	public final Column<LibroTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LibroTable, Long> libroId = createColumn(
		"libroId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<LibroTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<LibroTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<LibroTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<LibroTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LibroTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<LibroTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<LibroTable, String> titulo = createColumn(
		"titulo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LibroTable, String> escritor = createColumn(
		"escritor", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LibroTable, Date> publicacion = createColumn(
		"publicacion", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private LibroTable() {
		super("LIBRO_Libro", LibroTable::new);
	}

}