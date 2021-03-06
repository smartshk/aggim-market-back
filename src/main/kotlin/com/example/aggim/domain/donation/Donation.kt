package com.example.aggim.domain.donation

import javax.persistence.*

@Entity(name="donation")
data class Donation(
    var name: String,
    var goalVal: Int,
    var donatedVal: Int = 0
//    @OneToMany
//    @JoinColumn(name="donationId")
//    var donates: MutableList<Donation>
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}