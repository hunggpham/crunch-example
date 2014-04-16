/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.cloudera.sa.examples;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EmployeeRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EmployeeRecord\",\"namespace\":\"com.cloudera.sa.examples\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"salary\",\"type\":\"double\"},{\"name\":\"years_spent\",\"type\":\"int\"},{\"name\":\"title\",\"type\":\"string\"},{\"name\":\"department\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public int age;
  @Deprecated public double salary;
  @Deprecated public int years_spent;
  @Deprecated public java.lang.CharSequence title;
  @Deprecated public java.lang.CharSequence department;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public EmployeeRecord() {}

  /**
   * All-args constructor.
   */
  public EmployeeRecord(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.Integer age, java.lang.Double salary, java.lang.Integer years_spent, java.lang.CharSequence title, java.lang.CharSequence department) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.years_spent = years_spent;
    this.title = title;
    this.department = department;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return age;
    case 3: return salary;
    case 4: return years_spent;
    case 5: return title;
    case 6: return department;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    case 3: salary = (java.lang.Double)value$; break;
    case 4: years_spent = (java.lang.Integer)value$; break;
    case 5: title = (java.lang.CharSequence)value$; break;
    case 6: department = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
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
   * Gets the value of the 'years_spent' field.
   */
  public java.lang.Integer getYearsSpent() {
    return years_spent;
  }

  /**
   * Sets the value of the 'years_spent' field.
   * @param value the value to set.
   */
  public void setYearsSpent(java.lang.Integer value) {
    this.years_spent = value;
  }

  /**
   * Gets the value of the 'title' field.
   */
  public java.lang.CharSequence getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.CharSequence value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'department' field.
   */
  public java.lang.CharSequence getDepartment() {
    return department;
  }

  /**
   * Sets the value of the 'department' field.
   * @param value the value to set.
   */
  public void setDepartment(java.lang.CharSequence value) {
    this.department = value;
  }

  /** Creates a new EmployeeRecord RecordBuilder */
  public static com.cloudera.sa.examples.EmployeeRecord.Builder newBuilder() {
    return new com.cloudera.sa.examples.EmployeeRecord.Builder();
  }
  
  /** Creates a new EmployeeRecord RecordBuilder by copying an existing Builder */
  public static com.cloudera.sa.examples.EmployeeRecord.Builder newBuilder(com.cloudera.sa.examples.EmployeeRecord.Builder other) {
    return new com.cloudera.sa.examples.EmployeeRecord.Builder(other);
  }
  
  /** Creates a new EmployeeRecord RecordBuilder by copying an existing EmployeeRecord instance */
  public static com.cloudera.sa.examples.EmployeeRecord.Builder newBuilder(com.cloudera.sa.examples.EmployeeRecord other) {
    return new com.cloudera.sa.examples.EmployeeRecord.Builder(other);
  }
  
  /**
   * RecordBuilder for EmployeeRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EmployeeRecord>
    implements org.apache.avro.data.RecordBuilder<EmployeeRecord> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private int age;
    private double salary;
    private int years_spent;
    private java.lang.CharSequence title;
    private java.lang.CharSequence department;

    /** Creates a new Builder */
    private Builder() {
      super(com.cloudera.sa.examples.EmployeeRecord.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.cloudera.sa.examples.EmployeeRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.salary)) {
        this.salary = data().deepCopy(fields()[3].schema(), other.salary);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.years_spent)) {
        this.years_spent = data().deepCopy(fields()[4].schema(), other.years_spent);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.title)) {
        this.title = data().deepCopy(fields()[5].schema(), other.title);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.department)) {
        this.department = data().deepCopy(fields()[6].schema(), other.department);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing EmployeeRecord instance */
    private Builder(com.cloudera.sa.examples.EmployeeRecord other) {
            super(com.cloudera.sa.examples.EmployeeRecord.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.salary)) {
        this.salary = data().deepCopy(fields()[3].schema(), other.salary);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.years_spent)) {
        this.years_spent = data().deepCopy(fields()[4].schema(), other.years_spent);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.title)) {
        this.title = data().deepCopy(fields()[5].schema(), other.title);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.department)) {
        this.department = data().deepCopy(fields()[6].schema(), other.department);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'age' field */
    public java.lang.Integer getAge() {
      return age;
    }
    
    /** Sets the value of the 'age' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder setAge(int value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'age' field has been set */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'age' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder clearAge() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'salary' field */
    public java.lang.Double getSalary() {
      return salary;
    }
    
    /** Sets the value of the 'salary' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder setSalary(double value) {
      validate(fields()[3], value);
      this.salary = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'salary' field has been set */
    public boolean hasSalary() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'salary' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder clearSalary() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'years_spent' field */
    public java.lang.Integer getYearsSpent() {
      return years_spent;
    }
    
    /** Sets the value of the 'years_spent' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder setYearsSpent(int value) {
      validate(fields()[4], value);
      this.years_spent = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'years_spent' field has been set */
    public boolean hasYearsSpent() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'years_spent' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder clearYearsSpent() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'title' field */
    public java.lang.CharSequence getTitle() {
      return title;
    }
    
    /** Sets the value of the 'title' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder setTitle(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.title = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'title' field has been set */
    public boolean hasTitle() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'title' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder clearTitle() {
      title = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'department' field */
    public java.lang.CharSequence getDepartment() {
      return department;
    }
    
    /** Sets the value of the 'department' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder setDepartment(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.department = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'department' field has been set */
    public boolean hasDepartment() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'department' field */
    public com.cloudera.sa.examples.EmployeeRecord.Builder clearDepartment() {
      department = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public EmployeeRecord build() {
      try {
        EmployeeRecord record = new EmployeeRecord();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        record.salary = fieldSetFlags()[3] ? this.salary : (java.lang.Double) defaultValue(fields()[3]);
        record.years_spent = fieldSetFlags()[4] ? this.years_spent : (java.lang.Integer) defaultValue(fields()[4]);
        record.title = fieldSetFlags()[5] ? this.title : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.department = fieldSetFlags()[6] ? this.department : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
