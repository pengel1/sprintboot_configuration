package com.example.paulsdemo.repositories;
import com.example.paulsdemo.models.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package, Long> {

}
