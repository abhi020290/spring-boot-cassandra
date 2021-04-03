package com.springbootcassandra.springbootcassandra.repo;

import com.springbootcassandra.springbootcassandra.entity.PaymentDetails;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CassandraRepository<PaymentDetails,String> {

}
