/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUnsigned extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord> {

	private static final long serialVersionUID = 1307275488;

	/**
	 * The singleton instance of <code>PUBLIC.T_UNSIGNED</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.TUnsigned T_UNSIGNED = new org.jooq.test.h2.generatedclasses.tables.TUnsigned();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_UNSIGNED.U_BYTE</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UByte> U_BYTE = createField("U_BYTE", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

	/**
	 * The column <code>PUBLIC.T_UNSIGNED.U_SHORT</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UShort> U_SHORT = createField("U_SHORT", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this, "");

	/**
	 * The column <code>PUBLIC.T_UNSIGNED.U_INT</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UInteger> U_INT = createField("U_INT", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

	/**
	 * The column <code>PUBLIC.T_UNSIGNED.U_LONG</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.ULong> U_LONG = createField("U_LONG", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * Create a <code>PUBLIC.T_UNSIGNED</code> table reference
	 */
	public TUnsigned() {
		this("T_UNSIGNED", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.T_UNSIGNED</code> table reference
	 */
	public TUnsigned(java.lang.String alias) {
		this(alias, org.jooq.test.h2.generatedclasses.tables.TUnsigned.T_UNSIGNED);
	}

	private TUnsigned(java.lang.String alias, org.jooq.Table<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord> aliased) {
		this(alias, aliased, null);
	}

	private TUnsigned(java.lang.String alias, org.jooq.Table<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.h2.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.h2.generatedclasses.tables.TUnsigned as(java.lang.String alias) {
		return new org.jooq.test.h2.generatedclasses.tables.TUnsigned(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.h2.generatedclasses.tables.TUnsigned rename(java.lang.String name) {
		return new org.jooq.test.h2.generatedclasses.tables.TUnsigned(name, null);
	}
}