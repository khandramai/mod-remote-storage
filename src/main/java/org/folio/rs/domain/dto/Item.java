package org.folio.rs.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class Item {
  private String id;
  private String barcode;
  private String effectiveLocationId;
  private String instanceId;
  private EffectiveCallNumberComponents effectiveCallNumberComponents;
  private String holdingsRecordId;
  private String title;
  private List<ContributorName> contributorNames;
}
