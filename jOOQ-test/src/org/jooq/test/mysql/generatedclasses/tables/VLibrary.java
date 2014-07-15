/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.mysql.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = -1285384880;

	/**
	 * The singleton instance of <code>test.v_library</code>
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.mysql.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.VLibraryRecord.class;
	}

	/**
	 * The column <code>test.v_library.AUTHOR</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR.length(101), V_LIBRARY);

	/**
	 * The column <code>test.v_library.TITLE</code>. The book's title
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("v_library", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}
}