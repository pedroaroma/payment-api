/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.hatanaka.ecommerce.payment.event;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PaymentCreatedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8026340610582048912L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PaymentCreatedEvent\",\"namespace\":\"com.hatanaka.ecommerce.payment.event\",\"fields\":[{\"name\":\"checkoutCode\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"checkoutStatus\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"paymentCode\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private String checkoutCode;
   private Object checkoutStatus;
   private Object paymentCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PaymentCreatedEvent() {}

  /**
   * All-args constructor.
   * @param checkoutCode The new value for checkoutCode
   * @param checkoutStatus The new value for checkoutStatus
   * @param paymentCode The new value for paymentCode
   */
  public PaymentCreatedEvent(String checkoutCode, Object checkoutStatus, Object paymentCode) {
    this.checkoutCode = checkoutCode;
    this.checkoutStatus = checkoutStatus;
    this.paymentCode = paymentCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return checkoutCode;
    case 1: return checkoutStatus;
    case 2: return paymentCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: checkoutCode = (String)value$; break;
    case 1: checkoutStatus = (Object)value$; break;
    case 2: paymentCode = (Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'checkoutCode' field.
   * @return The value of the 'checkoutCode' field.
   */
  public String getCheckoutCode() {
    return checkoutCode;
  }

  /**
   * Sets the value of the 'checkoutCode' field.
   * @param value the value to set.
   */
  public void setCheckoutCode(String value) {
    this.checkoutCode = value;
  }

  /**
   * Gets the value of the 'checkoutStatus' field.
   * @return The value of the 'checkoutStatus' field.
   */
  public Object getCheckoutStatus() {
    return checkoutStatus;
  }

  /**
   * Sets the value of the 'checkoutStatus' field.
   * @param value the value to set.
   */
  public void setCheckoutStatus(Object value) {
    this.checkoutStatus = value;
  }

  /**
   * Gets the value of the 'paymentCode' field.
   * @return The value of the 'paymentCode' field.
   */
  public Object getPaymentCode() {
    return paymentCode;
  }

  /**
   * Sets the value of the 'paymentCode' field.
   * @param value the value to set.
   */
  public void setPaymentCode(Object value) {
    this.paymentCode = value;
  }

  /**
   * Creates a new PaymentCreatedEvent RecordBuilder.
   * @return A new PaymentCreatedEvent RecordBuilder
   */
  public static com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder newBuilder() {
    return new com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder();
  }

  /**
   * Creates a new PaymentCreatedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PaymentCreatedEvent RecordBuilder
   */
  public static com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder newBuilder(com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder other) {
    return new com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder(other);
  }

  /**
   * Creates a new PaymentCreatedEvent RecordBuilder by copying an existing PaymentCreatedEvent instance.
   * @param other The existing instance to copy.
   * @return A new PaymentCreatedEvent RecordBuilder
   */
  public static com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder newBuilder(com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent other) {
    return new com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder(other);
  }

  /**
   * RecordBuilder for PaymentCreatedEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PaymentCreatedEvent>
    implements org.apache.avro.data.RecordBuilder<PaymentCreatedEvent> {

    private String checkoutCode;
    private Object checkoutStatus;
    private Object paymentCode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.checkoutCode)) {
        this.checkoutCode = data().deepCopy(fields()[0].schema(), other.checkoutCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.checkoutStatus)) {
        this.checkoutStatus = data().deepCopy(fields()[1].schema(), other.checkoutStatus);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.paymentCode)) {
        this.paymentCode = data().deepCopy(fields()[2].schema(), other.paymentCode);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PaymentCreatedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.checkoutCode)) {
        this.checkoutCode = data().deepCopy(fields()[0].schema(), other.checkoutCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.checkoutStatus)) {
        this.checkoutStatus = data().deepCopy(fields()[1].schema(), other.checkoutStatus);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.paymentCode)) {
        this.paymentCode = data().deepCopy(fields()[2].schema(), other.paymentCode);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'checkoutCode' field.
      * @return The value.
      */
    public String getCheckoutCode() {
      return checkoutCode;
    }

    /**
      * Sets the value of the 'checkoutCode' field.
      * @param value The value of 'checkoutCode'.
      * @return This builder.
      */
    public com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder setCheckoutCode(String value) {
      validate(fields()[0], value);
      this.checkoutCode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'checkoutCode' field has been set.
      * @return True if the 'checkoutCode' field has been set, false otherwise.
      */
    public boolean hasCheckoutCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'checkoutCode' field.
      * @return This builder.
      */
    public com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder clearCheckoutCode() {
      checkoutCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'checkoutStatus' field.
      * @return The value.
      */
    public Object getCheckoutStatus() {
      return checkoutStatus;
    }

    /**
      * Sets the value of the 'checkoutStatus' field.
      * @param value The value of 'checkoutStatus'.
      * @return This builder.
      */
    public com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder setCheckoutStatus(Object value) {
      validate(fields()[1], value);
      this.checkoutStatus = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'checkoutStatus' field has been set.
      * @return True if the 'checkoutStatus' field has been set, false otherwise.
      */
    public boolean hasCheckoutStatus() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'checkoutStatus' field.
      * @return This builder.
      */
    public com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder clearCheckoutStatus() {
      checkoutStatus = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'paymentCode' field.
      * @return The value.
      */
    public Object getPaymentCode() {
      return paymentCode;
    }

    /**
      * Sets the value of the 'paymentCode' field.
      * @param value The value of 'paymentCode'.
      * @return This builder.
      */
    public com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder setPaymentCode(Object value) {
      validate(fields()[2], value);
      this.paymentCode = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'paymentCode' field has been set.
      * @return True if the 'paymentCode' field has been set, false otherwise.
      */
    public boolean hasPaymentCode() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'paymentCode' field.
      * @return This builder.
      */
    public com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent.Builder clearPaymentCode() {
      paymentCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public PaymentCreatedEvent build() {
      try {
        PaymentCreatedEvent record = new PaymentCreatedEvent();
        record.checkoutCode = fieldSetFlags()[0] ? this.checkoutCode : (String) defaultValue(fields()[0]);
        record.checkoutStatus = fieldSetFlags()[1] ? this.checkoutStatus : (Object) defaultValue(fields()[1]);
        record.paymentCode = fieldSetFlags()[2] ? this.paymentCode : (Object) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
