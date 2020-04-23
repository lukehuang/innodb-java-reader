/*
 * Copyright (C) 1999-2019 Alibaba Group Holding Limited
 */
package com.alibaba.innodb.java.reader.page.index;

import com.alibaba.innodb.java.reader.schema.Schema;

/**
 * For range query, this is the starting and ending pivot record.
 *
 * @author xu.zx
 */
public class DumbGenericRecord extends GenericRecord {

  private GenericRecord delegate;

  public DumbGenericRecord(RecordHeader header, Schema schema, long pageNumber) {
    super(header, schema, pageNumber);
  }

  public DumbGenericRecord(GenericRecord record) {
    super(record.getHeader(), record.getSchema(), record.getPageNumber());
    this.delegate = record;
  }

  public GenericRecord getDelegate() {
    return delegate;
  }
}
