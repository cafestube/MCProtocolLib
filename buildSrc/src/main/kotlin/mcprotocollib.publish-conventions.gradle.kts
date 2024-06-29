plugins {
    id("mcprotocollib.base-conventions")
    id("net.kyori.indra.publishing")
}

indra {
    publishSnapshotsTo("cafestubeRepository", "https://repo.cafestu.be/maven-public-snapshots")
    publishReleasesTo("cafestubeRepository", "https://repo.cafestu.be/maven-public")

    configurePublications {
        pom {
            organization {
                name = "GeyserMC"
                url = "https://github.com/GeyserMC"
            }
        }
    }
}
