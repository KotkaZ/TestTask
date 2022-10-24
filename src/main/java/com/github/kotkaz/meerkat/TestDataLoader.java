package com.github.kotkaz.meerkat;

import static com.github.kotkaz.meerkat.controller.FormDataApiImpl.FORM_DATA_ID;

import com.github.kotkaz.meerkat.model.FormData;
import com.github.kotkaz.meerkat.model.Sector;
import com.github.kotkaz.meerkat.repository.FormDataRepository;
import com.github.kotkaz.meerkat.repository.SectorRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataLoader implements ApplicationRunner {

    private final SectorRepository sectorRepository;

    private final FormDataRepository formDataRepository;


    @Override
    public void run(ApplicationArguments args) {

        val sectors = List.of(
            Sector.builder().sectorValue(1).textLabel("Manufacturing").build(),
            Sector.builder().sectorValue(19)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Construction materials")
                .build(),
            Sector.builder().sectorValue(18)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Electronics and Optics")
                .build(),
            Sector.builder().sectorValue(6).textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Food and Beverage")
                .build(),
            Sector.builder().sectorValue(342).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Bakery &amp; confectionery products")
                .build(),
            Sector.builder().sectorValue(43)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Beverages").build(),
            Sector.builder().sectorValue(42)
                .textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Fish &amp; fish products ")
                .build(),
            Sector.builder().sectorValue(40)
                .textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Meat &amp; meat products")
                .build(),
            Sector.builder().sectorValue(39)
                .textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Milk &amp; dairy products ")
                .build(),
            Sector.builder().sectorValue(437)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other").build(),
            Sector.builder().sectorValue(378)
                .textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Sweets &amp; snack food")
                .build(),
            Sector.builder().sectorValue(13).textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Furniture").build(),
            Sector.builder().sectorValue(389)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Bathroom/sauna ")
                .build(),
            Sector.builder().sectorValue(385)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Bedroom").build(),
            Sector.builder().sectorValue(390)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Children’s room ")
                .build(),
            Sector.builder().sectorValue(98)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Kitchen ").build(),
            Sector.builder().sectorValue(101)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Living room ").build(),
            Sector.builder().sectorValue(392)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Office").build(),
            Sector.builder().sectorValue(394).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other Sector.builder().sectorValue(Furniture)")
                .build(),
            Sector.builder().sectorValue(341)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Outdoor ").build(),
            Sector.builder().sectorValue(99)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Project furniture")
                .build(),
            Sector.builder().sectorValue(12).textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Machinery").build(),
            Sector.builder().sectorValue(94)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Machinery components")
                .build(),
            Sector.builder().sectorValue(91)
                .textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Machinery equipment/tools")
                .build(),
            Sector.builder().sectorValue(224)
                .textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Manufacture of machinery ")
                .build(),
            Sector.builder().sectorValue(97)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Maritime").build(),
            Sector.builder().sectorValue(271).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Aluminium and steel workboats ")
                .build(),
            Sector.builder().sectorValue(269).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Boat/Yacht building")
                .build(),
            Sector.builder().sectorValue(230).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Ship repair and conversion")
                .build(),
            Sector.builder().sectorValue(93)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Metal structures")
                .build(),
            Sector.builder().sectorValue(508)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other").build(),
            Sector.builder().sectorValue(227).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Repair and maintenance service")
                .build(),
            Sector.builder().sectorValue(11).textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Metalworking")
                .build(),
            Sector.builder().sectorValue(67).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Construction of metal structures")
                .build(),
            Sector.builder().sectorValue(263)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Houses and buildings")
                .build(),
            Sector.builder().sectorValue(267)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Metal products")
                .build(),
            Sector.builder().sectorValue(542)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Metal works").build(),
            Sector.builder().sectorValue(75).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CNC-machining")
                .build(),
            Sector.builder().sectorValue(62).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Forgings, Fasteners ")
                .build(),
            Sector.builder().sectorValue(69).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gas, Plasma, Laser cutting")
                .build(),
            Sector.builder().sectorValue(66).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;MIG, TIG, Aluminum welding")
                .build(),
            Sector.builder().sectorValue(9).textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Plastic and Rubber")
                .build(),
            Sector.builder().sectorValue(54)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Packaging").build(),
            Sector.builder().sectorValue(556)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plastic goods").build(),
            Sector.builder().sectorValue(559).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plastic processing technology")
                .build(),
            Sector.builder().sectorValue(55).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Blowing")
                .build(),
            Sector.builder().sectorValue(57).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Moulding")
                .build(),
            Sector.builder().sectorValue(53).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plastics welding and processing")
                .build(),
            Sector.builder().sectorValue(560)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plastic profiles")
                .build(),
            Sector.builder().sectorValue(5).textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Printing ").build(),
            Sector.builder().sectorValue(148)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Advertising").build(),
            Sector.builder().sectorValue(150)
                .textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Book/Periodicals printing")
                .build(),
            Sector.builder().sectorValue(145).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Labelling and packaging printing")
                .build(),
            Sector.builder().sectorValue(7)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Textile and Clothing").build(),
            Sector.builder().sectorValue(44)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Clothing").build(),
            Sector.builder().sectorValue(45)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Textile").build(),
            Sector.builder().sectorValue(8).textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Wood").build(),
            Sector.builder().sectorValue(337).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other Sector.builder().sectorValue(Wood)")
                .build(),
            Sector.builder().sectorValue(51)
                .textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Wooden building materials")
                .build(),
            Sector.builder().sectorValue(47)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Wooden houses").build(),
            Sector.builder().sectorValue(3).textLabel("Other").build(),
            Sector.builder().sectorValue(37)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Creative industries").build(),
            Sector.builder().sectorValue(29).textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Energy technology")
                .build(),
            Sector.builder().sectorValue(33).textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Environment")
                .build(),
            Sector.builder().sectorValue(2).textLabel("Service").build(),
            Sector.builder().sectorValue(25).textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Business services")
                .build(),
            Sector.builder().sectorValue(35).textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Engineering")
                .build(),
            Sector.builder().sectorValue(28)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Information Technology and Telecommunications")
                .build(),
            Sector.builder().sectorValue(581).textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Data processing, Web portals, E-marketing")
                .build(),
            Sector.builder().sectorValue(576)
                .textLabel(
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Programming, Consultancy")
                .build(),
            Sector.builder().sectorValue(121)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Software, Hardware")
                .build(),
            Sector.builder().sectorValue(122)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Telecommunications")
                .build(),
            Sector.builder().sectorValue(22).textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Tourism").build(),
            Sector.builder().sectorValue(141)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Translation services")
                .build(),
            Sector.builder().sectorValue(21)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;Transport and Logistics")
                .build(),
            Sector.builder().sectorValue(111)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Air")
                .build(),
            Sector.builder().sectorValue(114)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Rail")
                .build(),
            Sector.builder().sectorValue(112)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Road")
                .build(),
            Sector.builder().sectorValue(113)
                .textLabel("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Water").build()
        );
        sectorRepository.saveAllAndFlush(sectors);

        val selectedSector = sectorRepository.findBySectorValue(22).orElse(null);

        val formData = FormData
            .builder()
            .userAgreement(true)
            .userName("Mari Mustikas")
            .selectedSector(selectedSector)
            .build();

        FORM_DATA_ID = formDataRepository.saveAndFlush(formData).getId();
    }
}
