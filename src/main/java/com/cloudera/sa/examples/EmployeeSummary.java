/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.cloudera.sa.examples;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EmployeeSummary extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EmployeeSummary\",\"namespace\":\"com.cloudera.sa.examples\",\"fields\":[{\"name\":\"salary\",\"type\":\"double\"},{\"name\":\"department\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public double salary;
  @Deprecated public java.lang.String department;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public EmployeeSummary() {}

  /**
   * All-args constructor.
   */
  public EmployeeSummary(java.lang.Double salary, java.lang.String department) {
    this.salary = salary;
    this.department = department;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return salary;
    case 1: return department;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: salary = (java.lang.Double)value$; break;
    case 1: department = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'salary' field.
   */
  public java.lang.Double getSalary() {
    return salary;
  }

  /**
   * Sets the value of the 'salary' field.
   * @param value the value to set.
   */
  public void setSalary(java.lang.Double value) {
    this.salary = value;
  }

  /**
   * Gets the value of the 'department' field.
   */
  public java.lang.String getDepartment() {
    return department;
  }

  /**
   * Sets the value of the 'department' field.
   * @param value the value to set.
   */
  public void setDepartment(java.lang.String value) {
    this.department = value;
  }

  /** Creates a new EmployeeSummary RecordBuilder */
  public static com.cloudera.sa.examples.EmployeeSummary.Builder newBuilder() {
    return new com.cloudera.sa.examples.EmployeeSummary.Builder();
  }
  
  /** Creates a new EmployeeSummary RecordBuilder by copying an existing Builder */
  public static com.cloudera.sa.examples.EmployeeSummary.Builder newBuilder(com.cloudera.sa.examples.EmployeeSummary.Builder other) {
    return new com.cloudera.sa.examples.EmployeeSummary.Builder(other);
  }
  
  /** Creates a new EmployeeSummary RecordBuilder by copying an existing EmployeeSummary instance */
  public static com.cloudera.sa.examples.EmployeeSummary.Builder newBuilder(com.cloudera.sa.examples.EmployeeSummary other) {
    return new com.cloudera.sa.examples.EmployeeSummary.Builder(other);
  }
  
  /**
   * RecordBuilder for EmployeeSummary instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EmployeeSummary>
    implements org.apache.avro.data.RecordBuilder<EmployeeSummary> {

    private double salary;
    private java.lang.String department;

    /** Creates a new Builder */
    private Builder() {
      super(com.cloudera.sa.examples.EmployeeSummary.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.cloudera.sa.examples.EmployeeSummary.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.salary)) {
        this.salary = data().deepCopy(fields()[0].schema(), other.salary);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.department)) {
        this.department = data().deepCopy(fields()[1].schema(), other.department);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing EmployeeSummary instance */
    private Builder(com.cloudera.sa.examples.EmployeeSummary other) {
            super(com.cloudera.sa.examples.EmployeeSummary.SCHEMA$);
      if (isValidValue(fields()[0], other.salary)) {
        this.salary = data().deepCopy(fields()[0].schema(), other.salary);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.department)) {
        this.department = data().deepCopy(fields()[1].schema(), other.department);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'salary' field */
    public java.lang.Double getSalary() {
      return salary;
    }
    
    /** Sets the value of the 'salary' field */
    public com.cloudera.sa.examples.EmployeeSummary.Builder setSalary(double value) {
      validate(fields()[0], value);
      this.salary = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'salary' field has been set */
    public boolean hasSalary() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'salary' field */
    public com.cloudera.sa.examples.EmployeeSummary.Builder clearSalary() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'department' field */
    public java.lang.String getDepartment() {
      return department;
    }
    
    /** Sets the value of the 'department' field */
    public com.cloudera.sa.examples.EmployeeSummary.Builder setDepartment(java.lang.String value) {
      validate(fields()[1], value);
      this.department = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'department' field has been set */
    public boolean hasDepartment() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'department' field */
    public com.cloudera.sa.examples.EmployeeSummary.Builder clearDepartment() {
      department = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public EmployeeSummary build() {
      try {
        EmployeeSummary record = new EmployeeSummary();
        record.salary = fieldSetFlags()[0] ? this.salary : (java.lang.Double) defaultValue(fields()[0]);
        record.department = fieldSetFlags()[1] ? this.department : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}